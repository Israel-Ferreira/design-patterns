package org.example.creationalpatterns.factory.apple.factory;

import org.example.creationalpatterns.factory.apple.model.IPhone;
import org.example.creationalpatterns.factory.apple.model.IPhoneX;

public class IphoneXFactory extends IPhoneFactory{
    @Override
    public IPhone createIphone() {
        return new IPhoneX();
    }
}
