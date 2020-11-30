public class Gini {
    public double giniPonderado(float derecho1, float derecho2, float izq1, float izq2) {
        if((derecho1+derecho2)==0 || (izq1+izq2)==0){
            return 0.5;
        }
        double res = ((izq1 + izq2) * impureza(izq1, izq2) + (derecho1 + derecho2) * impureza(derecho1, derecho2))/(izq1 + izq2 + derecho1 + derecho2);
        return res;
    }

    public double impureza(float n1, float n2) {
        double p1 = n1 / (n2 + n1);
        double p2 = n2 / (n2 + n1);
        double res = 1.0 - (p1 * p1 + p2 * p2);
        return res;
    }
}
