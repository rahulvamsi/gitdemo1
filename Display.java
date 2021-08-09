public static void main(String[] args) throws IOException {
		String path="C:\Users\0025CF744\Desktop\training\workspaces\Products.csv";
		List<List<String>>  records = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(path));) {
		    while (scanner.hasNextLine()) {
		      records.add(getRecordFromLine(scanner.nextLine()));
		    }
		}
		
		Main obj=new Main();
		for(int i=0;i<records.size();i++) {
		     obj.productList.add(new Product(records.get(i).get(0),records.get(i).get(1),records.get(i).get(2),Integer.parseInt(records.get(i).get(3)),Integer.parseInt(records.get(i).get(4))));
		}
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		while(true) {
			System.out.println("                        ");
			System.out.println("CHOOSE A OPTIONS BELOW");
			System.out.println("1 SHOW ALL PRODUCTS");
			System.out.println("2 SEARCH THE PRODUCT");
			System.out.println("3 ORDER THE PRODUCT");
			System.out.println("4 UPDATED CART");
		    System.out.println("5 EXIT");
			
			String s = reader.readLine();
			//System.out.println(s);
			
			switch(s) {
				case "1" :
					allProducts();
					break;
				case "2" : 
					searchProduct();
					break;
				case "3" : 
					orderProduct() ;
					break;
				case "4" : 
					updatedCart();
					break;
				case "5" : 
					System.exit(0);
			}
		}
		
		
	}