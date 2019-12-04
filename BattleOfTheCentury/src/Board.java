
import java.util.Map;

public class Board {
	
	private Board(Builder builder) {
		
	}
	
	public Tile getTile(final int tileCoordinate) {
		return null;
	}
	
	public static class Builder{
		
		Map<Integer, Piece> boardConfig;
		Alliance nextMoveMaker;
		
		public Builder() {
			
		}
		
		public Builder setPiece(final Piece piece) {
			this.boardConfig.put(piece.getPiecePosition(), piece);
			return this;
		}
		
		public Builder setMoveMaker(final Alliance nextMoveMaker) {
			this.nextMoveMaker = nextMoveMaker;
			return this;
		}
		
		public Board build() {
			return new Board(this);
		}
		
	}
	
}
