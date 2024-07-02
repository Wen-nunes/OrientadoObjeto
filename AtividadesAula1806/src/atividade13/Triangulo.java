package atividade13;

class Triangulo {
    private double l1;
    private double l2;
    private double l3;

    public Triangulo(double l1, double l2, double l3) {
        validarTriangulo(l1, l2, l3);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    private void validarTriangulo(double l1, double l2, double l3) {
        if (l1 <= 0 || l2 <= 0 || l3 <= 0 || l1 + l2 <= l3 || l1 + l3 <= l2 || l2 + l3 <= l1) {
            throw new IllegalArgumentException("Não é possível formar um triângulo com esses lados");
        }
    }

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }
}
