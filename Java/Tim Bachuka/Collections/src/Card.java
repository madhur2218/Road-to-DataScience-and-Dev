public record Card(Suit suit, String face, int rank) {
    public enum Suit {
        CLUB,DIAMOND, HEART,SPADE;

        public char getImage(){
            return (new char[] {1,2,3,4})[this.ordinal()];
        }
    }
}
