package org.example.creationalpatterns.abstractfactory.apple.factory.abstractFactory;


import org.example.creationalpatterns.abstractfactory.apple.model.certificate.Certificate;
import org.example.creationalpatterns.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
