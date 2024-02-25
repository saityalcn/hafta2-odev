package com.example.saityalcin;

import com.example.saityalcin.service.EntityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaityalcinApplication {


	private static final EntityService ENTITY_SERVICE = new EntityService();

	public static void main(String[] args) {
		System.out.println("Evlerin toplam fiyatlari: " + SaityalcinApplication.ENTITY_SERVICE.getTotalPriceOfHouses());
		System.out.println("Villalarin  toplam fiyatlari: " + SaityalcinApplication.ENTITY_SERVICE.getTotalPriceOfVillas());
		System.out.println("Yazliklarin  toplam fiyatlari: " + SaityalcinApplication.ENTITY_SERVICE.getTotalPriceOfSummerHouses());
		System.out.println("Tum tipteki evlerin toplam fiyatlari: " + SaityalcinApplication.ENTITY_SERVICE.getTotalPriceOfAll());

		System.out.println("Evlerin ortalama metrekaresi: " + SaityalcinApplication.ENTITY_SERVICE.getAverageAreaOfHouses());
		System.out.println("Villalarin ortalama metrekaresi: " + SaityalcinApplication.ENTITY_SERVICE.getAverageAreaOfVillas());
		System.out.println("Yazliklarin ortalama metrekaresi: " + SaityalcinApplication.ENTITY_SERVICE.getAverageAreaOfSummerHouses());
		System.out.println("Tum tipteki evlerin ortalama metrekaresi: " + SaityalcinApplication.ENTITY_SERVICE.getAverageAreaOfAll());

		System.out.println("Oda ve salon sayisina gore tum tipteki evleri filtreleme sonucu: " + SaityalcinApplication.ENTITY_SERVICE.filterByNumberOfRoomsAndSaloons(3L,2L));

		SpringApplication.run(SaityalcinApplication.class, args);
	}

}
