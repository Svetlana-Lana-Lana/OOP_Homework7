class Division implements Action {

    @Override
    public int calculation(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return x / y;
    }

    @Override
    public String getOperationSign() {
        return "/";
    }
}
