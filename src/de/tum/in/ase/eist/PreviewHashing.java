package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {

    public PreviewHashing(HashFunction implementation) {
        super(implementation);
    }

    public PreviewHashing() {
        super();

    }

    @Override
    public String hashDocument(String input) {
        return null;
    }
}
