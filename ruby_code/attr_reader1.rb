class Item
	
	def initialize(item_name, quantity)
		@item_name = item_name
		@quantity = quantity
	end

	def item_name
		@item_name
	end

	def quantity
		@quantity
	end
end


tv = Item.new("TV", 2)
puts tv.item_name
puts tv.quantity