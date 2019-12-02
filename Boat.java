/**
 * Boat Manager class.
 * @author Nicolas Carcagno
 * @version 1.0
 */
class Boat {
    private String  mName ;
    private int     mLife ;
    private int     mLength ;
    private boolean mState ;

    /**
     * Boat constructor
     * @param pName Ship type name
     * @param pLenght Boat's length
     * @param pState Boat's state : true is Alive / false is dead
     */
    public Boat(String pName, int pLenght, int pState) {
        setName(pName) ;
        setLife(pLenght) ;
        setLenght(pLenght) ;
        setState(true) ;
    }

    /**
     * 
     * @param pName Name to set
     */
    private void setName(String pName) {
        mName = pName ;
    }

    /**
     * 
     * @param pLife Life to set
     */
    private void setLife(int pLife) {
        mLife = pLife ;
    }

    /**
     * 
     * @param pLength Length to set
     */
    private void setLenght(int pLength) {
        mLength = pLength ;
    }

    /**
     * 
     * @param pState State to set
     */
    private void setState(boolean pState) {
        mState = true ;
    }

    /**
     * @return current Name
     */
    public final String getName() {
        return mName ;
    }

    /**
     * @return current Length
     */
    public final int getLength() {
        return mLength ;
    }

    /**
     * @return current Life
     */
    public final int getLife() {
        return mLife ;
    }

    /**
     * @return current State
     */
    public final boolean getState() {
        return mState ;
    }

    /**
     * The boat received damage
     */
    public void takeDamage() {
        mState = ( --mLife <= 0 ) ? false : true ;
    }

    /**
     * Is boat alive ?
     * @return true if is alive, false also.
     */
    public boolean isAlive() {
        return mState ;
    }
}
