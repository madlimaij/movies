package com.madli.movies.movie;

import com.madli.movies.review.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies" ) //collection = tabel vist
@Data //Lombokis,hoolitseb getterite-setterite ja ...meetodite eest
@AllArgsConstructor //loob konstruktori, mis kasutab kõiki private välju argumentidena
@NoArgsConstructor // loob konstruktori ilma parameetriteta
public class Movie {
 @Id //annotatsioon - seda propertyt tuleks kohelda unikaalse identifikaatorina
 private Object id;
 private String imdbId;
 private String title;
 private String releaseDate;
 private String trailerLink;
 private String poster;
 private List<String> genres;
 private List<String> backdrops;
 @DocumentReference //db salvestab ainult review id ja reviewd on eraldi tabelis; manual reference relationship; muidu lisaks kõik filmiga seotud reviewd siia listi; kui on üks mitmele suhe, siis on nii ka ok, aga kui ei taha reviewsid kõiki lisada, vaid lisada hoopis reviewde reference'id??? vist
 private List<Review> reviewsIds;
}
