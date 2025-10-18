abstract  class Expr {
    static class Binary extends Expr{
        Binary(Expr left, Token operator, Expr right){
            this.left = left;
            this.operator = operator;
            this.right = right;
        }

        private Expr left;
        private Token operator;
        private Expr right;
    }
}
