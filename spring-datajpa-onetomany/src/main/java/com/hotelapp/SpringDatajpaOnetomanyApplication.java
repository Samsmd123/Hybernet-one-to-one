package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Item;
import com.hotelapp.model.Type;
import com.hotelapp.service.IHotelService;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication  implements CommandLineRunner{

	@Autowired
	IHotelService hotelService;
	
	public void setHotelService(IHotelService hotelService) {
		this.hotelService = hotelService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Item item1=new Item("PaniPuri","Indian","FASTFOOD",Type.VEG,60.0);
		Item item2=new Item("HariyaliKabeb",Category.STARTERS,"Indian",Type.NONVEG,260);
		Item item3=new Item("MuttonCurry",Category.MAINCOURSE,"Indian",Type.NONVEG,460);
		Item item4=new Item("Pulao",Category.MAINCOURSE,"Indian",Type.VEG,160);
		Item item5=new Item("Noodles",Category.FASTFOOD,"Chineese",Type.VEG,150);
		
		Set<Item> items=new HashSet<>(Arrays.asList(item1,item2,item3,item4,item5));
		
		Hotel hotel=new Hotel("Mainland",Type.VEG,"Hyderbad",4.5,items);
		
		
		Item item6=new Item("Shahi Chicken",Category.STARTERS,"Indian",Type.NONVEG,260);
		Item item7=new Item("kunafa",Category.DESSERTS,"Turkey",Type.VEG,260);
		Item item8=new Item("Custard",Category.DESSERTS,"Indian",Type.VEG,160);
		Item item9=new Item("Pasta",Category.FASTFOOD,"",Type.VEG,460);
		Set<Item> itemsList=new HashSet<>(Arrays.asList(item6,item7,item8,item9));
		Hotel hotel1=new Hotel("karama",Type.NONVEG,"Turkey",5.0,items);
		
		hotelService.getALL().forEach(System.out::println);
	}

}
