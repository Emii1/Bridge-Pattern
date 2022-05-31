package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {

    public PreviewHashing(HashFunction implementation) {
        super(implementation);
    }

    public PreviewHashing() {
        super(new SimpleHashAlgorithm());

    }

    @Override
    public String hashDocument(String input) {
        if (input.length() > 1000) {
            throw new IllegalArgumentException();
        }
        else return getImplementation().calculateHashCode(input);
    }
}
