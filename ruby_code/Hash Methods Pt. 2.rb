h={:banana=>:fruit,
   :toucan=>:bird,
   :car=>:machine}
   
 h.each_key{|key| print "#{key},"}
 puts "\n"
 h.each_value{|value| print "#{value},"}
 puts "\n"