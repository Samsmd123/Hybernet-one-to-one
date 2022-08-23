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
		
		Item item1=new Item("MalaiKabeb",Category.STARTERS,"Indian",Type.NONVEG,260);
		Item item2=new Item("Muttonchops",Category.MAINCOURSE,"Indian",Type.NONVEG,460);
		Item item3=new Item("Pizza",Category.MAINCOURSE,"Italiyan",Type.VEG,160);
		Item item4=new Item("Noodles",Category.FASTFOOD,"Chineese",Type.VEG,150);
		
		Set<Item> items=new HashSet<>(Arrays.asList(item1,item2,item3,item4));
		
		Hotel hotel=new Hotel("Mainland",Type.VEG,"Hyderbad",4.5,items);
		hotelService.addHotel(hotel);
		
		Item item5=new Item("Shahi Chicken",Category.STARTERS,"Indian",Type.NONVEG,260);
		Item item6=new Item("kunafa",Category.DESSERTS,"Turkey",Type.VEG,260);
		Item item7=new Item("Custard",Category.DESSERTS,"Indian",Type.VEG,160);
		Item item9=new Item("Pasta",Category.FASTFOOD,"Italian",Type.VEG,460);
		Item item10=new Item("Mojito",Category.BEVERGAES,"Italian",Type.VEG,120);
		Item item11=new Item("Dosa",Category.BREAKFAST,"Indian",Type.VEG,60);
		Item item12=new Item("idly",Category.BREAKFAST,"Indian",Type.VEG,60);
		Set<Item> itemsList=new HashSet<>(Arrays.asList(item5,item6,item7,item9,item10,item11,item12));
		Hotel hotel1=new Hotel("MTR",Type.NONVEG,"Bangalore",5.0,itemsList);
		//hotelService.addHotel(hotel1);
		
		System.out.println("---------BY TYPE-------------");
		System.out.println();
		hotelService.getByItemName("MTR").forEach(System.out::println);
		
		System.out.println();
		System.out.println("---------BY Category-------------");
		hotelService.getByCategory(Category.STARTERS).forEach(System.out::println);
		
		System.out.println();
		System.out.println("---------BY Cuisine And Type-------------");
		hotelService.getByCuisineAndType("MalaiKabeb", Type.NONVEG).forEach(System.out::println);
		
		System.out.println();
		System.out.println("---------BY Cuisine-------------");
		hotelService.getByCuisine("kunafa").forEach(System.out::println);
		
		System.out.println();
		System.out.println("---------BY Item Name LessPrice-------------");
		hotelService.getByItemNameLessPrice("idly", 60).forEach(System.out::println);
		
		System.out.println();
		hotelService.getALL().forEach(System.out::println);
	}

}
