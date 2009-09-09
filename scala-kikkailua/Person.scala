/*
 * Just testing things out & playing around.
 *
 */

class Person(fn: String, ln: String, b: String)
{
	var fname = fn;
	var lname = ln;
	var birth = b;

	def set_fname(fn: String): Unit = {fname = fn}
	def set_lname(ln: String): Unit = {lname = ln}
	def set_birth(b: String): Unit = {
	/* 
		Validate birthday first 
 		-->format: dd.mm.yyyy		
		-->allowed range:  (current date + 1) > yyyy > 1900
		throw exception if out of range.
	*/
		birth = b
	}
	def get_fname(): String = {fname}
	def get_lname(): String = {lname}
	def get_birth(): String = {birth}
	def get_age(): String = {"/* count the persons age in years */"}
}

