package org.example.creationalpatterns.factory.apple.factory;

import org.example.creationalpatterns.factory.apple.model.IPhone;
import org.example.creationalpatterns.factory.apple.model.IPhone11Pro;

public class Iphone11ProFactory extends IPhoneFactory{
    @Override
    public IPhone createIphone() {
        return new IPhone11Pro();
    }
}
