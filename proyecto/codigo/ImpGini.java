public class ImpGini {
    public double giniPond(float rightNode0, float rightNode1, float leftNode0, float leftNode1) {
        if((rightNode0+rightNode1)==0 || (leftNode0+leftNode1)==0){
            return 0.5;
        }
        double result = ((leftNode0 + leftNode1) * impureza(leftNode0, leftNode1) + (rightNode0 + rightNode1) * impureza(rightNode0, rightNode1))/ (leftNode0 + leftNode1 + rightNode0 + rightNode1);
        return result;
    }

    public double impureza(float n1, float n2) {
        double p1 = n1 / (n2 + n1);
        double p2 = n2 / (n2 + n1);
        double imp = 1.0 - (p1 * p1 + p2 * p2);
        return imp;
	}
}