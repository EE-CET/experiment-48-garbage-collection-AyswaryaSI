class GarbageCollection {
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageDemo obj = new GarbageDemo();

        // Make the object eligible for garbage collection
        obj = null;

        // Request garbage collection
        System.gc();
    }
}
