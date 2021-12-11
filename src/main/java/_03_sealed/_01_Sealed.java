package _03_sealed;

sealed interface IdentityPlatform permits Google, SocialNetworks, EmailProvider {
    void connect();
}

final class Google implements IdentityPlatform {
    @Override
    public void connect() {
        System.out.println("You're logged in with your Google account");
    }
}

sealed abstract class SocialNetworks implements IdentityPlatform permits Facebook, Twitter {
}

final class Facebook extends SocialNetworks {

    @Override
    public void connect() {
        System.out.println("Welcome! I hope you'll have 300 new friends today");
    }
}

final class Twitter extends SocialNetworks {
    @Override
    public void connect() {
        System.out.println("Hey! You can publicly tell all of your private life");
    }

}

// Anyone can create its own email provider
non-sealed interface EmailProvider extends IdentityPlatform {
}

public class _01_Sealed {

    public static void main (String... args) {
        EmailProvider caramail = () -> System.out.println("Huhum, are you sure it's still existing?");

        caramail.connect();
    }

}
