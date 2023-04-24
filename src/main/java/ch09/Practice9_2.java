package ch09;

public class Practice9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2?" + (p1 == p2)); // 주소(참조변수) 비교
        System.out.println("p1.equals(p2)?" + (p1.equals(p2))); // 내용 비교할 수 있게 equals 오버라이딩
    }
}

class Point3D {
    int x,y,z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D() {
        this(0, 0, 0);
    }

    public boolean equals(Object obj) {
        /**
         * 인스턴스 변수 x,y,z를 비교하도록 오버라이딩하시오.
         */
        if (!(obj instanceof Point3D)) return false;

        return x==((Point3D)obj).x && y==((Point3D)obj).y && z==((Point3D)obj).z;
    }

    public String toString() {
        /**
         * 인스턴스 변수 x,y,z의 내용을 출력하도록 오버라이딩하시오.
         */
        return "[" + x + "," + y + "," + z + "]";
    }
}
