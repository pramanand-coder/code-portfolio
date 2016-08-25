class Candle #<-----object
	def melt #<-----method
		light = Lighter.new
		light.light_candle
		puts "Whoa! Now I'm melting!"
	end
end