// @Author Diana master
    public class Cuadrado implements INTERFACE{
        private double lado;

        public Cuadrado() {
        }

        public Cuadrado(double lado) {
            this.lado = lado;
        }

        public double getLado() {
            return lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }

        @Override
        public String toString() {
            return "Cuadrado{" +
                    "lado=" + lado +
                    '}';
        }

        public double calcularArea(){
            return this.lado * this.lado;
        }
    }
