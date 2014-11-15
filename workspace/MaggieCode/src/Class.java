
public class Class {
	d3_geom_polygonPrototype.area = function() {
		  var i = -1,
		      n = this.length,
		      a,
		      b = this[n - 1],
		      area = 0;

		  while (++i < n) {
		    a = b;
		    b = this[i];
		    area += a[1] * b[0] - a[0] * b[1];
		  }

		  return area * .5;
		};

}
