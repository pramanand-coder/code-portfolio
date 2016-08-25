def tell_me_if_im_rich(bank_balance)
unless (bank_balance>1000000)
puts "You aren't rich, nice try!"
 else
  puts"Okay, fine, you are rich."
 end
end

tell_me_if_im_rich(5)
tell_me_if_im_rich(2000000)