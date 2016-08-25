products = [1,2,3,4,5,6]

item_sale1 = products[1]
item_sale2 = products[4]

sale_products = (item_sale1..item_sale2).to_a


puts sale_products