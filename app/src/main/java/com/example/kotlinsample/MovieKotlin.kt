package com.example.kotlinsample

class MovieKotlin{
    //주연
    var leadingActors: List<ActorKotlin?>? = null;
    //조연
    var supportingActors: List<ActorKotlin?>? = null;
    //제목
    var title: String? =null
    //상연연도
    var showingAge: Int = 0
    //장르 - 공포 코미디 멜로 액션
    var genre: String? = null
    //배우 클래스
    class ActorKotlin{
        //본명
        var realName: String? = null
        //예명
        var stageName: String? = null
        //나이
        var age: Int = 0
        //성별
        var gender:String? = null
        //출연작
        var actedMovies: List<Movie?>? = null
    }

    fun casting(movies: List<MovieKotlin?>?): mutableList<ActorKotlin> {
        var recommendedActors = mutableListOf<ActorKotlin>()
        movies?.forEach{ movie ->
            if(movie?.title?.contains("도시") == true){
                movie.leadingActors?.filter{
                    it?.gender =="W" && it.age >= 20 && it.age < 30 && (it.actedMovies?.size ?:0)>5}?.forEach{it?.let {recommendedActors.add(it)}
                }

                movie.supportingActors?.filter{
                    it?.gender == "M" && it.age >= 30 && it.age <40 && it.actedMovies?.filter{it?.genre =="공포"}?.size ?:0 >3
                }?.forEach{ it?.let{recommendedActors.add(it)}}
            }
        }

        return recommendedActors
    }
}