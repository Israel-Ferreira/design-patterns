package org.example.creationalpatterns.factory.apple.factory;

import org.example.creationalpatterns.factory.apple.model.IPhone;
import org.example.creationalpatterns.factory.apple.model.IPhone11;

public class Iphone11Factory extends IPhoneFactory{
    @Override
    public IPhone createIphone() {
        return new IPhone11();
    }
}
