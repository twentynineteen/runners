package dev.danmills.runners.user;
/*
 * {
 * "id": 1,
 * "name": "Leanne Graham",
 * "username": "Bret",
 * "email": "Sincere@april.biz",
 * "address": {
 * "street": "Kulas Light",
 * "suite": "Apt. 556",
 * "city": "Gwenborough",
 * "zipcode": "92998-3874",
 * "geo": {
 * "lat": "-37.3159",
 * "lng": "81.1496"
 *       }
 *    },
 * "phone": "1-778-736-8031 x56442",
 * "website": "hildegaard.org",
 * "company": {
 *    "name": "Romaquera-Crona",
 *    "catchphrase": "Multi-layered client-servers",
 *    "bs": "harness real time e-markets"
 *    }
 * },
 */


public record User(
   Integer id,
   String name,
   String username,
   String email,
   Address address,
   String phone,
   String website,
   Company company
) {

}
