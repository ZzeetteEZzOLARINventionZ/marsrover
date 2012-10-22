class Rover
  attr_accessor :navigator, :visual,  :plateau
  def initialize(str,plateau)
    str = str.split
    @navigator = Navigator.new(str[0].to_i, str[1].to_i, str[2])
    @plateau = plateau
  end
  def inspect
    {:x => @navigator.pos_x, :y => @navigator.pos_y, :d => @navigator.direction.to_enum}
  end
  def command(string)
    string.split(//).each do |c|
      case c
        when /(L|R)/
          @navigator.rotate(c)
          puts "Rotate #{c} direction: #{@navigator.direction.to_enum}" if @visual
        when 'M'
          old_x, old_y = @navigator.pos_x, @navigator.pos_y
          @navigator.move
          if checkplateau
              puts "Step forward from (#{old_x},#{old_y}) to (#{@navigator.pos_x}, #{@navigator.pos_y})" if @visual
            else
              puts "Out of the plateau when Step forward from (#{old_x},#{old_y}) to (#{@navigator.pos_x}, #{@navigator.pos_y})" if @visual
          end
      end
    end
  end
  def checkplateau
    if @plateau.size[0][0]<=@navigator.pos_x && @plateau.size[0][1]<=@navigator.pos_y &&
      @plateau.size[1][0]>=@navigator.pos_x && @plateau.size[1][1]>=@navigator.pos_x
      return true
    else
      return false
    end
  end
end