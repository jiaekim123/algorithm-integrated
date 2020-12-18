package programmers.courses30.lesson68994;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
	public int solution(int[][] maps) {
		boolean[][] visited = new boolean[maps.length][maps[0].length];
		return bfs(maps, visited, new Point(0, 0, 0), maps[0].length - 1, maps.length - 1);
	}

	private int bfs(int[][] map, boolean[][] visited, Point point, int row, int col) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.offer(point);
		while (!queue.isEmpty()) {
			Point now = queue.poll();
			if (now.y == map.length - 1 && now.x == map[0].length - 1) {
				return now.distance + 1;
			} else {
				for (Direction direction : Direction.values()) {
					if (now.checkDirection(map, visited, row, col, direction)) {
						Point newPoint = now.move(direction);
						visited[newPoint.y][newPoint.x] = true;
						queue.offer(newPoint);
					}
				}
			}
		}

		return -1;
	}

	class Point {
		int x;
		int y;
		int distance;

		public Point(int x, int y, int distance) {
			this.x = x;
			this.y = y;
			this.distance = distance;
		}

		public Point move(Direction direction) {
			return new Point(this.x + direction.x, this.y + direction.y, this.distance + 1);
		}

		public boolean checkDirection(int[][] map, boolean[][] visited, int row, int col, Direction direction) {
			int posX = this.x + direction.x;
			int posY = this.y + direction.y;
			if (posX < 0 || posX > row || posY < 0 || posY > col) {
				return false;
			} else {
				if (visited[posY][posX] || (map[posY][posX] == 0) )
					return false;
			}
			return true;
		}
	}

	enum Direction {
		RIGHT(1, 0), LEFT(-1, 0), UP(0, 1), DOWN(0, -1), START(0, 0);
		int x;
		int y;

		Direction(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}

public class MinDistGameMap {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(new int[][] { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 } }));
		System.out.println(new Solution().solution(new int[][] { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 1 } }));
//		System.out.println(new Solution().solution(new int[][] { { 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1 },
//				{ 1, 0, 1, 0, 1 }, { 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 } }));
//		System.out.println(new Solution().solution(new int[][] { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 },
//				{ 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 } }));

	}

}
