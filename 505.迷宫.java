import java.util.*;

class Solution {
    class Pair {
        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        return bfs(maze, start, destination);
    }

    public int bfs(int[][] maze, int[] start, int[] destination) {
        // 先是基础的corner case判断
        // 但这里并不全，比如其实可以写判断这个length是不是为2
        if (maze == null || maze.length == 0 || start == null || start.length == 0 || destination == null
                || destination.length == 0)
            return -1;
        int row = maze.length;
        int col = maze[0].length;
        // 这个是遍历上下左右的基础套路了
        // 通过dx[i]和dy[i]循环四次就可以遍历上下左右的坐标
        int[] dx = new int[] { 1, 0, -1, 0 };
        int[] dy = new int[] { 0, 1, 0, -1 };
        // 数组定义了从起点到当前点所用所有可能性里的最短距离
        int[][] distance = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // 因为在后面的逻辑是
                // 只要这个距离变得更小就会更新
                // 所以初始值设为不可能的大值就可以
                distance[i][j] = Integer.MAX_VALUE;
            }
        }
        // 起始位置设为0 因为起点到当前位置就是0
        distance[start[0]][start[1]] = 0;
        // 设置queue 为bfs注入灵魂
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(start[0], start[1]));
        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            // 上下左右遍历
            for (int i = 0; i < 4; i++) {
                // 这两行一定要写在for 循环内
                // 以便于刷新回初始值
                int x = cur.x;
                int y = cur.y;
                // 从distance里取出当前位置目前最优值
                int dist = distance[x][y];
                // 这里因为题目要求，选择一个方向就要走到底
                // 所以用while来写
                // 条件的话就是不越界的条件
                // 每走一步dist就要++
                while (x >= 0 && x < row && y >= 0 && y < col && maze[x][y] == 0) {
                    x += dx[i];
                    y += dy[i];
                    dist++;
                }
                // 因为跳出while循环说明当前xy和dist是不符合的（即撞墙或出界）
                // 所以要回到前一个点（比如撞墙或者出界前的一个点）
                // 那相应xy, dist都需要回退一步
                x -= dx[i];
                y -= dy[i];
                dist--;
                // 如果当前这一次的dist优于之前所储存的值（比如其他路径来的）
                // 那就替换distance的数据以让这个数组保持最优解
                // 同时如果不是终点的话就把这个当前位置继续存入
                if (dist < distance[x][y]) {
                    distance[x][y] = dist;
                    if (cur.x!= destination[0] || cur.y!= destination[1]) {
                        queue.offer(new Pair(x, y));
                    }
                }
            }
        }
        // 最后return的就是distance中的终点位置
        int result = distance[destination[0]][destination[1]];
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
