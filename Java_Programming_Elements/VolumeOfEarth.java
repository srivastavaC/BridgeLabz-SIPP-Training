package java_programming_elements;
class VolumeOfEarth{
    public static void main(String[] args){
        double radius = 6371;
        double pi = 3.14;
        double volume = (4/3) * pi * radius * radius * radius;
        System.out.println("The Volume Of Earth is: " + volume);
    }
}