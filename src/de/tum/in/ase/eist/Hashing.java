package de.tum.in.ase.eist;

public abstract class Hashing  {

    private HashFunction implementation;

    public Hashing(HashFunction implementation) {
        this.implementation = implementation;
    }

    public Hashing() {

    }

    public HashFunction getImplementation() {
        return implementation;
    }

    public void setImplementation(HashFunction implementation) {
        this.implementation = implementation;
    }

    public String calculateHashCode(String input) {
        return null;
    }



     public abstract String hashDocument(String input);
}
