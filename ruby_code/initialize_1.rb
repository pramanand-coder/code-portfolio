class Person
	attr_accessor :name

	def initialize(name)
		@name = name
	end

	def greeting
		"Hello #{name}"
	end
end

person = Person.new
person.name = "Dennis"
puts person.greeting