interface Operation{
    int execute(int a,int b);
}
//class Add implements Operation{
//
//    @Override
//    public int execute(int a, int b) {
//        return a+b;
//    }
//}
//class Sub implements Operation{
//
//    @Override
//    public int execute(int a, int b) {
//        return a-b;
//    }
//}
public class LambdaExpression {
    public static void main(String[] args) {
        Operation add = (a,b) -> a+b;
        System.out.println(add.execute(1437,2939));

        Operation sub=(a,b)->a-b;
        System.out.println(sub.execute(1437,2939));


    }
}
