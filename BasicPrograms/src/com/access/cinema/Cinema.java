package com.access.cinema;

	public class Cinema {
		
		private String fMovie;
		public void setMovie(String movieName) {
			fMovie=movieName;
		}
		public String getMovie() {
			return fMovie;
		}
		public void fResult() {
		System.out.printf("Your Fav Movie is %s",getMovie()); //accepts two arguments with ','	
		}
		}

/*
   * constructor
   * Method Name as class name
*/
