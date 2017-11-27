public interface I1
    /* ACC_SUPER bit NOT set */
{
    public abstract void mA();
    public static interface InnerI1
    /* ACC_SUPER bit NOT set */
    {
        public static final int k = 41;
        public abstract void innerA();
    }
}
