x = %w[Frank Al Dan]

puts x.inject {|memo,val| "#{memo},#{val}"}

puts x.inject ('The Monday Night Football hosts are:') {|memo,val| "#{memo},#{val},"}