require_relative 'lib/plateau'
require_relative 'lib/direction'
require_relative 'lib/navigator'
require_relative 'lib/rover'
# Plateu Singleton.
rover = Rover.new('1 2 N')
rover.visual = false
rover.command('LMLMLMLMM')
puts rover.inspect
rover = Rover.new('3 3 E')
rover.visual = false
rover.command('MMRMMRMRRM')
puts rover.inspect

