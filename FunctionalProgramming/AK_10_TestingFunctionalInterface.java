package FunctionalProgramming;

public class AK_10_TestingFunctionalInterface {
    public static void main(String[] args) {
        AK_10_Candidate candidate = num -> {
            for(int i=2; i<num; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
          return true;
        };

        System.out.println(candidate.isCandidate(5));
        System.out.println(candidate.isCandidate(50));
    }
}
