package level3.HomeWork;

//Объекты передаются методам по ссылке
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    //     Передача объекта методу . Теперь переменные оЬ . а и оЬ . Ь
//         объекта, используемого при вызове, также будут изменяться.
    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class CallByRef {
    public static void main(String args[]) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a и оЬ.Ь перед вызовом: " +
                ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a и оЬ.Ь после вызова: "
                + ob.a + " " + ob.b);
    }
}
