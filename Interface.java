public interface Interface {

    public default void step() {
        System.out.println( getClass() + " прощел еще немного... " );
    }

    public default void step( String direction ) {
        System.out.println( getClass() + " прощел " + direction + " еще немного... " );
    }
    public default void stepUp()    { this.step( "вперед" ); }
    public default void stepDown()  { this.step( "назад" ); }
    public default void stepLeft()  { this.step( "влево" ); }
    public default void stepRight() { this.step( "вправо" ); }

    default String getInfo() {
        return getClass().getSimpleName();
    }
}
