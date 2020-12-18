package programmers.courses30.lesson68969;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public int solution(String dirs) {
		return countVisitedPosition(dirs.toCharArray());
	}

	private int countVisitedPosition(char[] moveArr) {
		List<Position> visitedPosition = new ArrayList<Position>();
		Position position = new Position(0, 0);
		for (char move : moveArr) {
			Position movedPosition = Position.movePosition(move, position.x, position.y);
			// 같은 위치에 있지 않고, 현재 위치에서 가려는 방향, 반대 방향에서 오는 것이 list에 있지 않으면 걸어본 길이 리스트에 추가한다.
			if (!visitedPosition.contains(movedPosition)
					&& !visitedPosition.contains(Position.getOppositePosition(movedPosition))
					&& !(position.x == movedPosition.x && position.y == movedPosition.y)) {
				visitedPosition.add(movedPosition);
			}
			position.x = movedPosition.x;
			position.y = movedPosition.y;
		}
		return visitedPosition.size();
	}
}

class Position {
	private static final int X_LENGTH = 5;
	private static final int Y_LENGTH = 5;
	int x;
	int y;
	Direction direction;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public enum Direction {
		L, R, U, D
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Position) {
			Position std = (Position) obj;
			return ((this.x == std.x) && (this.y == std.y) && (this.direction == std.direction));
		}
		return false;
	}

	public static Position getOppositePosition(Position position) {
		Position oppositePosition = new Position(position.x, position.y);
		if (position.direction != null) {
			switch (position.direction) {
			case L:
				oppositePosition.direction = Direction.R;
				oppositePosition.x = position.x - 1;
				break;
			case R:
				oppositePosition.direction = Direction.L;
				oppositePosition.x = position.x + 1;
				break;
			case U:
				oppositePosition.direction = Direction.D;
				oppositePosition.y = position.y + 1;
				break;
			case D:
				oppositePosition.direction = Direction.U;
				oppositePosition.y = position.y - 1;
				break;
			}
		}
		return oppositePosition;
	}

	public static Position movePosition(char move, int x, int y) {
		Position position = new Position(x, y);
		switch (move) {
		case 'L':
			if (x > -X_LENGTH) {
				position.x = position.x - 1;
				position.direction = Direction.R;
			}
			break;
		case 'R':
			if (x < X_LENGTH) {
				position.x = position.x + 1;
				position.direction = Direction.L;
			}
			break;
		case 'U':
			if (y < Y_LENGTH) {
				position.y = position.y + 1;
				position.direction = Direction.D;
			}
			break;
		case 'D':
			if (y > -Y_LENGTH) {
				position.y = position.y - 1;
				position.direction = Direction.U;
			}
			break;
		}
		return position;
	}
}

public class VisitLength {
	public static void main(String[] args) {
		System.out.println(new Solution().solution("ULURRDLLU"));
		System.out.println(new Solution().solution("LULLLLLLU"));

		System.out.println(new Solution().solution("LLLRRR"));
		System.out.println(new Solution().solution("RRRRRRRUUUUDDLDLDLD"));
	}
}
