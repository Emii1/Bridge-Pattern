package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {

    public EnterpriseHashing(HashFunction implementation) {
        super(new CryptoSecureHashAlgorithm());
    }

    public EnterpriseHashing() {
    }




    @Override
    public String hashDocument(String input) {
        return getImplementation().calculateHashCode(input);
    }
}
