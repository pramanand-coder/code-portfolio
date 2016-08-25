class Item
	
	attr_reader :item_name
	attr_writer :item_name

end

coffee Item.new
coffee.item_name = "Dunkin Donuts"
puts coffee.item_name