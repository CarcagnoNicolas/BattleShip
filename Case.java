/**
 * Case Manager class.
 * @author Nicolas Carcagno
 * @version 1.0
 */

class Case {
    /**
     * Boat on the case. Can be null (no boat on the case).
     */
    Boat mBoat ;

    /**
     * Case's state
     *  true : case attacked
     *  false: case not attacked
     */
    Boolean mState ;

    /**
     * Case's character value
     *  * : boat
     *  x : attacked
     *    : empty
     */
    Character mDisplay ;

    /**
     * Case constructor
     * @param pState Case was attacked (true) or false.
     */
    public Case(Boolean pState) {
        setState(pState) ;
    }

    /**
     * @return current Boat
     */
    public final Boat getBoat() {
        return mBoat ;
    }

    /**
     * @return current State
     */
    public final Boolean getState() {
        return mState ;
    }

    /**
     * 
     * @param pBoat Boat to set
     */
    public void setBoat(Boat pBoat) {
        mBoat = pBoat ;
    }

    /**
     * 
     * @param pState State to set
     */
    public void setState(Boolean pState) {
        mState = pState ;
    }

}