class Item
	
	attr_reader :item_name

	def item_name(str)
		@item_name = (str)
	end
end

coffee = Item.new
coffee.item_name = 'Starbucks'
puts coffee.item_name