class Multiplication implements Action {

    @Override
    public int calculation(int x, int y) {
        return x * y;
    }

    @Override
    public String getOperationSign() {
        return "*";
    }
}
