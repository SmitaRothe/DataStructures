package ArrayExample;

    class Person{
        String name;
        int age;

        Person(String name, int age){
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }

    }
    public class Array {

        public static void main(String[] args) {
            int[] intArray = new int[10];
            int x=intArray.length;

            Person[] personArray = new Person[12];
            personArray[0]=new Person("A", 12);
            personArray[1]=new Person("B", 14);
            personArray[2]=new Person("C", 11);

            Person p=personArray[1];
            p.age=20;

            System.out.println(personArray[1]);
        }
    }


