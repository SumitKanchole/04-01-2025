interface library {
    void issueBook();
    void returnBook();
}
class Students implements library {
    public void issueBook() {
        System.out.println("issued book by student");
    }
    public void returnBook() {
        System.out.println("returned book by student");
    }
}
class Teachers implements library {
    public void issueBook() {
        System.out.println("issued book by Teacher");
    }
    public void returnBook() {
        System.out.println("returned book by Teacher");
    }
}
class B3 {
    public static void main(String args[]) {
        library lib = new Students();
        lib.issueBook();
        lib.returnBook();

        lib = new Teachers();
        lib.issueBook();
        lib.returnBook();
    }
}